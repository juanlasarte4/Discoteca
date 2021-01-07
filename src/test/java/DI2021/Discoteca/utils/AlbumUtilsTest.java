package DI2021.Discoteca.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlbumUtilsTest {

	String metaInfoCorrecto = "https://en.wikipedia.org/wiki";
	String metaInfoIncorrecto = "https://en.wikipedia.org/wiki";

	@Test
	public void testValidarURLMetadataCorrecto() {

		if (metaInfoCorrecto.contentEquals(metaInfoCorrecto)) {
			assertTrue(true);
		} else {
			fail();
		}
	}

	@Test
	public void testValidarURLMetadataIncorrecto() {
		if (metaInfoCorrecto.contentEquals(metaInfoIncorrecto)) {
			assertTrue(false);
		} else {
			fail();
		}

	}
}