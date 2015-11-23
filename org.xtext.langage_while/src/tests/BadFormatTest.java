package tests;

/**
 * Prend en paramètre un fichier .while. La classe vérifie si l'extension est du format
 * while ou whpp.
 */
public class BadFormatTest extends AbstractTest{

	private static final String EXTENSION = "while";
	private static final String EXTENSION2 = "whpp";

	@Override
	public void tester() {
		int pos = entry.lastIndexOf(".");
		if (pos > -1) {
			String ext = entry.substring(pos+1);
			if(ext.equals(EXTENSION) || ext.equals(EXTENSION2)) {
				if (prettyPrinting("src/entries/", entry) != null) {
					this.rapport = OK + getClass().getSimpleName() + " : le fichier est de bonne extension et a ete pretty printe(extension = ."+EXTENSION+" ou ." + EXTENSION2 + ")";
					estValide = true;
				}
				else {
					this.rapport= FAIL + getClass().getSimpleName() + " : le fichier est de bonne extension et n'a pas  ete pretty printe(extension = ."+EXTENSION+" ou ." + EXTENSION2 + ")";
					estValide = true;
				}

			}
			else {
				if (prettyPrinting("src/entries/", entry) != null) {
					this.rapport = FAIL + getClass().getSimpleName() + " : le fichier ne correspond pas au format de fichier attendu, extension attendu = ."+EXTENSION+" ou ." + EXTENSION2 + " et extension reussi = ."+ext;
					estValide = false;
				}
				else {
					this.rapport = OK + getClass().getSimpleName() + " : le fichier n'est pas de bonne extension et a ete rejete par le pretty printer (extension = ."+ext+")";
					estValide = true;
				}
			}

		} 
		else {
			if (prettyPrinting("src/entries/", entry) != null) {
				this.rapport = FAIL + getClass().getSimpleName() + " : un fichier sans extension a ete pretty printe";
				estValide = false;
			}
			else {
				this.rapport = OK + getClass().getSimpleName() + " : un fichier sans extension a ete rejete ";
				estValide = true;
			}
		}
	}
}


