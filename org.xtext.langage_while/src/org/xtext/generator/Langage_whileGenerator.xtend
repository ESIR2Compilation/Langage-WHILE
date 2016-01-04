/*

 * generated by Xtext

 */

package org.xtext.generator



import com.google.inject.Inject

import java.io.BufferedWriter

import java.io.File

import java.io.FileWriter

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

import org.xtext.langage_while.Output

import org.xtext.langage_while.SYMB

import org.xtext.langage_while.VAR

import org.xtext.langage_while.Vars

import org.xtext.langage_while.While

import tabSymb.Fonction

import tabSymb.TabSymbole
import java.util.List
import Chevron.Chevron3a
import java.util.ArrayList
import java.util.Map
import org.xtext.langage_while.Model
import org.xtext.langage_while.Program

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
	
	def List<Chevron3a> createList(){
		return new ArrayList<Chevron3a>();
	}

	  @Inject extension IQualifiedNameProvider
	
		TabSymbole tableS= new TabSymbole();

		Fonction fonct;
		int cpt=0;
		List <Chevron3a> listChev; 
		Map<String,List <Chevron3a> > code3a;

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
	'''
	
	def compile (Program p)
	'''
	«cpt = 0»
	«FOR f:p.f»
	«f.compile»
	«ENDFOR»
	'''

	def compile(Function f) '''
	«currentFunction = f.name.compile»
		«tableS.addSymbole(f.name.bs+f.name.cf)»
		«cpt++»
		«fonct = createFonct(cpt) »
		«tableS.addFonction((f.name.bs+f.name.cf),fonct)»
	//listChev = createList()
	//code3a.put((f.name.bs+f.name.cf),listChev)
		function «f.name.compile» :
		«f.def.compile(f.name.bs+f.name.cf)»
	'''

	def compile(Definition d, String a) 
	''' 
		read «d.in.compile(a)»
		% «d.com.compile("")»
		% write «d.out.compile(a)»
	'''

	def compile(Input i, String a) 
	'''
		«var int j = 0»«FOR va : i.v»«var v = va.compile»
			«fonct.incNbEntree()»
			«fonct.addVariable(va.bv+va.cf)»«v»«IF j++ < i.v.size-1», «ENDIF»
			//listChev.add(new Chevron3a("read",(va.bv+va.cf),null,null))
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
				//listChev.add(new Chevron3a("write",va.bv+va.cf,null,null))
		«ENDFOR»
	'''

	def compile(Commands cs, String space) 
	'''
		«var int j = 0»
		«FOR c : cs.c»«c.compile(space)»
			«IF j++ < cs.c.size-1»;
			«ENDIF»
		«ENDFOR»
	'''

	def compile(Command c, String space	)
	'''
		«IF c.assign != null»
			«c.assign.compile(space)»
		«ENDIF»
		«IF c.nop != null»
			«space»nop
		«ENDIF»
		«IF c.^if != null»
			«c.^if.compile(space)»
		«ENDIF»
		«IF c.ifc != null»
			«c.ifc.compile(space)»
		«ENDIF»
		«IF c.wh != null»
			«c.wh.compile(space)»
		«ENDIF»
		«IF c.^for != null»
			«c.^for.compile(space)»
		«ENDIF»
		«IF c.fore != null»
			«c.fore.compile(space)»
		«ENDIF»
	'''

	def compile(Assign a, String space)
	'''
		«space» «a.vs.compile» := «a.ex.compile»
	'''

	def compile(If i, String space) 
	'''
		«space»if «i.ex.compile»
		«space»then
		«i.ct.compile(space)»
		«space»else
		«i.ce.compile(space)»
		«space»fi
	'''

	def compile(Ifconfort i, String space) 
	'''
		«space»if «i.ex.compile»
		«space»then
		«i.c.compile(space)»
		«space»fi
	'''

	def compile(For f, String space) 
	'''
		«space»for 
		«f.ex.compile»
		«space»do
		«f.c.compile(space)»
		«space»od
	'''

	def compile(Foreach f, String space) 
	'''
		«space»foreach «f.ex1.compile» in «f.ex2.compile»
		«space»do
		«f.c.compile(space)»
		«space»od
	'''

	def compile(While w, String space)
	'''
		«space»while «w.ex.compile»
		«space»do
		«w.c.compile(space)»
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