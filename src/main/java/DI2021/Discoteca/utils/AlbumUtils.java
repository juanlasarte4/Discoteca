package DI2021.Discoteca.utils;

public class AlbumUtils {
	public static boolean ValidarURLMetadata(String metaInfo) {
		// Este método debe validar que las url de metadatos de los albums referencian
		// al sitio web del disco en la wikipedia.
		boolean correcto = false;
		if (metaInfo.contentEquals("https://en.wikipedia.org/wiki/")) {
			correcto = true;
			System.out.println("La URL es correcta.");
		} else {
			correcto = false;
			System.out.println("La URL es incorrecta.");
		}
		return (Boolean) correcto;
	}
}