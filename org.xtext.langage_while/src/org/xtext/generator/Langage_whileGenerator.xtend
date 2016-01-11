/*
 * generated by Xtext
 */

package org.xtext.generator

import code3a.Chevron
import code3a.Cons
import code3a.Read
import code3a.Write
import com.google.inject.Inject
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.Langage_whileStandaloneSetup
import org.xtext.langage_while.Assign
import org.xtext.langage_while.Command
import org.xtext.langage_while.Commands
import org.xtext.langage_while.Definition
import org.xtext.langage_while.Expr
import org.xtext.langage_while.ExprAnd
import org.xtext.langage_while.ExprEq
import org.xtext.langage_while.ExprNot
import org.xtext.langage_while.ExprOr
import org.xtext.langage_while.ExprSimple
import org.xtext.langage_while.Exprs
import org.xtext.langage_while.For
import org.xtext.langage_while.Foreach
import org.xtext.langage_while.Function
import org.xtext.langage_while.If
import org.xtext.langage_while.Ifconfort
import org.xtext.langage_while.Input
import org.xtext.langage_while.LExpr
import org.xtext.langage_while.Model
import org.xtext.langage_while.Output
import org.xtext.langage_while.Program
import org.xtext.langage_while.SYMB
import org.xtext.langage_while.VAR
import org.xtext.langage_while.Vars
import org.xtext.langage_while.While
import tabSymb.Fonction
import tabSymb.TabSymbole
import code3a.Iterabl
import code3a.Fonct
import code3a.EndFunct
import code3a.Nil
import code3a.Nop
import code3a.CodeJava
import code3a.Var
import code3a.IfConf

class Langage_whileGenerator implements IGenerator {

	def public File generate(String path, String file)

	{

		val injector = new Langage_whileStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);

		val uri = URI.createURI(path + file);
		var pos = file.lastIndexOf(".");
		var ext = file.substring(pos+1);

		if (! ext.equals("while"))
			return null;

		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		var name = file.substring(0, pos);
		var out = name;
		if (path.equals("src/outputs/"))
			out += "1";
		out += ".whpp";

		try{
  			val fstream = new FileWriter("src/outputs/" + out);
  			val buff = new BufferedWriter(fstream);
  			for(p: xtextResource.allContents.toIterable.filter(Program))

				buff.write(p.compile().toString);
		System.out.println("test test\n");

  				buff.close();

  			return new File("src/outputs/" + out);

  		}catch (Exception e){

  			e.printStackTrace();

  		}

  		return null;

	}

	

	def Fonction createFonct(int i){
		return  new Fonction("funct"+i);
	}
	
	
	def Iterabl createFor(String expr){
		return code3a.Iterabl.createFor(expr); 
	}
	
	def code3a.If createIf(String expr){
		return code3a.If.createIf(expr); 
	}
	
	def IfConf createIfConf(String exp){
		return IfConf.createIfConf(exp);
	}
	
	def Iterabl createForeach(String expr,String x){
		return code3a.Iterabl.createForeach(expr,x); 
	}
	
	def Iterabl createWhile(String expr){
		return code3a.Iterabl.createWhile(expr); 
	}
	
	def Chevron createRead(String x){
		return new Read(x);
	}
	
	def Chevron createWrite(String x){
		return new Write(x);
	} 
	
	def Chevron createFnct(String read1){
		return new Fonct(read1);
	}
	
	def Chevron createEndFnct(){
		return new EndFunct();
	}
	
	def Chevron getcode(Command c){
		if(c.nop != null){
			return new Nop();
		}
		//faire la même chose pour toutes les autres commandes
		if(c.^for!=null){ cptTmp++
			val Iterabl res=createFor(getCodeExpr(c.^for.ex,cptTmp).write);
			ajouterCodeCommandes(c.^for.c,res)
			return res;
		}
		
		if (c.wh!=null){ cptTmp++
			val Iterabl res=createWhile(getCodeExpr(c.wh.ex,cptTmp).write);
			ajouterCodeCommandes(c.wh.c,res);
			return res;
		}
		
		if (c.assign!=null){
			
		}
		if(c.fore!=null){ cptTmp++
			val Iterabl res=createForeach(getCodeExpr(c.fore.ex2,cptTmp).write,getCodeExpr(c.fore.ex1,cptTmp).write);
			ajouterCodeCommandes(c.fore.c,res);
			return res;
		}
		
		if (c.^if!=null){ cptTmp++
			val code3a.If res=createIf(getCodeExpr(c.^if.ex,cptTmp).write);
			ajouterCodeCommandesIf(c.^if.ct,c.^if.ce,res);
			return res;
			
		}
		
		return new Nop();
	}
	
	def Chevron getCodeExpr(Expr ex, int cmpt){
		if(ex.exs!=null){
			if(ex.exs.nil!=null) return new Nil();
			
			if(ex.exs.mot=="cons"){
				if(ex.exs.lex!=null){
					return new Cons("tmp"+cmpt,"X","Y"); //juste un test!!!!!	
				}
			} 
			if(ex.exs.v!=null){
				return new Var("V");
			}
			return new Cons("test1","X","Y"); //Attention à finir
		}
		else return new Cons("tmp2","X","Y");//A completer également
	}
	
	def void ajouterCodeCommandes(Commands cs,Iterabl opCode){
		for(Command c: cs.c){
			opCode.addCommande(getcode(c));
		}
	}
	
	def void ajouterCodeCommandesIf(Commands cs1,Commands cs2,code3a.If opCode){
		for(Command c: cs1.c){
			opCode.addCommande1(getcode(c));
		}
		for(Command c: cs2.c){
			opCode.addCommande2(getcode(c));
		}
	}
	
		def void ajouterCodeCommandesIfConf(Commands cs,IfConf opCode){
		for(Command c: cs.c){
			opCode.addCommande(getcode(c));
		}
	}
	
	def Chevron createNop(){
		return new Nop();
	}

	  @Inject extension IQualifiedNameProvider
	
		TabSymbole tableS= new TabSymbole();

		Fonction fonct;
		int cpt=0;
		List <Chevron> listChev; 
		Chevron chevLocal;
		Iterabl chevIt;
		int i=0;
		int alpha;
		int cptTmp;
		//Map<String,List <Chevron3a> > code3a;

		CharSequence currentFunction;

	

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		var File file = new File(resource.URI.toString);
		var String name = file.name;

		if (name.contains("."))
			name = name.substring(0, name.lastIndexOf("."));

		var String output = "";

		for (f : resource.allContents.toIterable.filter(Model)) {
			output += f.compile + '\n'
		}
		fsa.generateFile(name + "-pp.txt", output)
	}

	def void generate(Resource resource, IFileSystemAccess fsa, String outputFile) {
		var File file = new File(resource.URI.toString)
		var String name = file.name

		if (name.contains("."))
			name = name.substring(0, name.lastIndexOf("."));

		var String output = "";

		for (f : resource.allContents.toIterable.filter(Model)) {
			output += f.compile + '\n'
		}
		fsa.generateFile(outputFile, output);
	}

	def compile (Model ll)
	'''
	«ll.nn.compile»
	«tableS.afficher»
	«System.out.println("================code3@================\n")»
	«
	for(Chevron ch:listChev){
		i++;
		System.out.println(i+""+ch.toString)
	}»
	« System.out.println("================Code java===============\n"+CodeJava.genereCodeJava(listChev))»
	'''
	
	def compile (Program p)
	'''
	«listChev=new ArrayList<Chevron>()»
	«cptTmp=0
	»
	«cpt = 0»
	«FOR f:p.f»
	«chevLocal=createFnct("funct"+cpt) »
	«listChev.add(chevLocal)»
	«f.compile»
	«chevLocal=createEndFnct() »
	«listChev.add(chevLocal)»
	«ENDFOR»
	
	'''

	def compile(Function f) '''
	«currentFunction = f.name.compile»
		«tableS.addSymbole(f.name.bs+f.name.cf)»
		
		«cpt++»
		«fonct = createFonct(cpt) »
		«tableS.addFonction((f.name.bs+f.name.cf),fonct)»
		function «f.name.compile» :
		«f.def.compile(f.name.bs+f.name.cf)»
	'''

	def compile(Definition d, String a) 
	''' 
		read «d.in.compile(a)»
		% «d.com.compile("", true)»
		% write «d.out.compile(a)»
	'''

	def compile(Input i, String a) 
	'''
		«var int j = 0»«FOR va : i.v»«var v = va.compile»
			«fonct.incNbEntree()»
			«fonct.addVariable(va.bv+va.cf)»«v»«IF j++ < i.v.size-1», «ENDIF»//tabSyb à modifier
			«chevLocal =createRead(va.bv+va.cf) »
			«listChev.add(chevLocal)»
		«ENDFOR»
	'''

	def compile(Vars v) 
	'''
		«var int j = 0»
		«FOR va : v.vs»
			«va.compile»«IF j++ < v.vs.size-1», «ENDIF»
		«ENDFOR»
	'''

	def compile(VAR v) 
	'''
		«var v2 = v.bv + v.cf»
		«v2»
	'''

	def compile(Output o, String a)
	'''
		«var int j = 0»
		«FOR va : o.v»
			«var v = va.compile»
			«fonct.incNbSortie()»
			«fonct.addVariable(va.bv+va.cf)»«v»«IF j++ < o.v.size-1», «ENDIF»
			«chevLocal=createWrite(va.bv+va.cf)»
			«listChev.add(chevLocal)»	
		«ENDFOR»
	'''

	def compile(Commands cs, String space, boolean a) 
	'''
		«var int j = 0»
		«FOR c : cs.c»«c.compile(space, a)»
			«IF j++ < cs.c.size-1»;
			«ENDIF»
		«ENDFOR»
	'''

	def compile(Command c, String space, boolean a	)
	'''
		«IF c.assign != null»
			«c.assign.compile(space)»
		«ENDIF»
		«IF c.nop != null»
			«space»nop
			«chevLocal = createNop»
			«if (a)
			listChev.add(chevLocal)»
		«ENDIF»
		«IF c.^if != null»
			«c.^if.compile(space,a)»
		«ENDIF»
		«IF c.ifc != null»
			«c.ifc.compile(space,a)»
		«ENDIF»
		«IF c.wh != null»
			«c.wh.compile(space,a)»
		«ENDIF»
		«IF c.^for != null»
			«c.^for.compile(space,a)»
		«ENDIF»
		«IF c.fore != null»
			«c.fore.compile(space,a)»
		«ENDIF»
	'''

	def compile(Assign a, String space)
	'''
		«space» «a.vs.compile» := «a.ex.compile»
	'''

	def compile(If i, String space,boolean b) 
	'''
		«space»if 
		«cptTmp++»
		«if(b) alpha=cptTmp»
		« val Chevron chev=getCodeExpr(i.ex,cptTmp)»
		« listChev.add(chev)»
		«i.ex.compile»
		«space»then
		«i.ct.compile(space, false)»
		«space»else
		«i.ce.compile(space, false)»
		«if(b){	cptTmp=alpha
			val code3a.If ch=createIf(chev.write)
			ajouterCodeCommandesIf(i.ct,i.ce,ch)
			listChev.add(ch)
		}»
		«space»fi
	'''

	def compile(Ifconfort i, String space,boolean b) 
	'''
		«space»if 
		«cptTmp++»
		«if(b) alpha=cptTmp»
		« val Chevron chev=getCodeExpr(i.ex,cptTmp)»
		« listChev.add(chev)»
		«i.ex.compile»
		«space»then
		«i.c.compile(space, false)»
		«if(b){	cptTmp=alpha
			val IfConf ch=createIfConf(chev.write)
			ajouterCodeCommandesIfConf(i.c,ch)
			listChev.add(ch)
		}»
		«space»fi
	'''

	def compile(For f, String space,boolean b) 
	'''
		«space»for 
		«cptTmp++»
		«if(b) alpha=cptTmp»
		« val Chevron chev=getCodeExpr(f.ex,cptTmp)»
		« listChev.add(chev)»
		«f.ex.compile»
		«space»do
		«f.c.compile(space, false)»
		«if(b){	cptTmp=alpha
			val Iterabl chIt=createFor(chev.write)
			ajouterCodeCommandes(f.c,chIt)
			listChev.add(chIt)
		}»
		«space»od
	'''

	def compile(Foreach f, String space,boolean b) 
	'''
		«space»foreach 
		«cptTmp++»
		« val Chevron chev=getCodeExpr(f.ex1,cptTmp)»
		« listChev.add(chev)»
		«cptTmp++»
		« val Chevron chev2=getCodeExpr(f.ex2,cptTmp)»
		« listChev.add(chev2)»
		«if(b) alpha=cptTmp»
		«f.ex1.compile» in
		«f.ex2.compile»
		«space»do
		«f.c.compile(space, false)»
		«if(b){	cptTmp=alpha
			val Iterabl chIt=createForeach(chev2.write,chev.write)
			ajouterCodeCommandes(f.c,chIt)
			listChev.add(chIt)
		}»
		«space»od
	'''

	def compile(While w, String space,boolean b)
	'''
		«space»while 
		«space»do
		«cptTmp++»
		«if(b) alpha=cptTmp»
		« val Chevron chev=getCodeExpr(w.ex,cptTmp)»
		« listChev.add(chev)»
		«w.ex.compile»
		«w.c.compile(space, false)»
		«if(b){	cptTmp=alpha
			val Iterabl chIt=createWhile(chev.write)
			ajouterCodeCommandes(w.c,chIt)
			listChev.add(chIt)
		}»
		«space»od
	'''

	def compile(Exprs e) 
	'''
		«var int j = 0»
		«FOR ex : e.ex»
			«ex.compile»
			«IF j++ < e.ex.size-1», «ENDIF»
		«ENDFOR»
	'''

	def compile(Expr e) 
	'''«IF e.exs != null»
			«e.exs.compile»
		«ENDIF»
		«IF e.exa != null»
			«e.exa.compile»
		«ENDIF»
	'''

	def compile(ExprAnd e) '''«e.exo1.compile»«var int j = 0»«FOR ex : e.exo2»«IF j++ < e.exo2.size» and «ENDIF»«ex.compile»«ENDFOR»'''

	def compile(ExprOr e) '''«e.exn1.compile»«var int j = 0»«FOR ex : e.exn2»«IF j++ < e.exn2.size» or «ENDIF»«ex.compile»«ENDFOR»'''

	def compile( ExprNot e) '''«IF e.exQ1 != null»not «e.exQ1.compile»«ENDIF»«IF e.exQ2 != null»«e.exQ2.compile»«ENDIF»'''

	def compile(ExprEq e) '''«IF e.exS1 != null && e.exS2 != null»(«e.exS1.compile» =? «e.exS2.compile»)«ENDIF»«IF e.ex != null»(«e.ex.compile»)«ENDIF»'''

	def compile(LExpr e) '''«var int j = 0»«FOR ex : e.e»«ex.compile»«IF j++ < e.e.size-1 && j != 0» «ENDIF»«ENDFOR»'''

	def compile( ExprSimple e ) '''«IF e.nil != null»nil«ENDIF»«IF e.v != null»«e.v.compile»«ENDIF»«IF e.sym != null && e.lex == null»«e.sym.compile»«ENDIF»«IF e.mot != null && e.lex != null »(«e.mot» «e.lex.compile»)«ENDIF»«IF e.mot != null && e.ex != null »(«e.mot» «e.ex.compile»)«ENDIF»«IF e.sym != null && e.lex != null »(«e.sym.compile» «e.lex.compile»)«ENDIF»'''

	def compile(SYMB s) '''«s.bs»«s.cf»'''
}