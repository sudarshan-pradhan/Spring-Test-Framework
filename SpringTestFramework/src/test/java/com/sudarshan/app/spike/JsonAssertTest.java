package com.sudarshan.app.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	/**
	 * content().json() utilizes JSONAssert,
	 * So this class helps understanding working of JSONAssert
	 */

	String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

	@Test
	public void jsonAssert_StrictTrue_ExactMatchExceptForSpaces() throws JSONException {
		String expectedResponse = "{\"id\": 1, \"name\":\"Ball\", \"price\":10, \"quantity\":100}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);
	}

	@Test
	public void jsonAssert_StrictFalse() throws JSONException {
		String expectedResponse = "{\"id\": 1, \"name\":\"Ball\", \"price\":10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}

	@Test
	public void jsonAssert_WithoutEscapeCharacters() throws JSONException {
		String expectedResponse = "{id:1, name:Ball, price:10}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);
	}

	/**
	 * For strict true, we cannot remove any Json element or any escape characters.
	 * But possible with strict false.
	 */

}
