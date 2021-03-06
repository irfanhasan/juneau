// ***************************************************************************************************************************
// * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file *
// * distributed with this work for additional information regarding copyright ownership.  The ASF licenses this file        *
// * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance            *
// * with the License.  You may obtain a copy of the License at                                                              *
// *                                                                                                                         *
// *  http://www.apache.org/licenses/LICENSE-2.0                                                                             *
// *                                                                                                                         *
// * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an  *
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the        *
// * specific language governing permissions and limitations under the License.                                              *
// ***************************************************************************************************************************
package org.apache.juneau.uon;

import org.apache.juneau.*;
import org.apache.juneau.parser.*;
import org.apache.juneau.urlencoding.*;

/**
 * Parses UON (a notation for URL-encoded query parameter values) text into POJO models.
 *
 * <h5 class='section'>Media types:</h5>
 *
 * Handles <code>Content-Type</code> types: <code>text/uon</code>
 *
 * <h5 class='section'>Description:</h5>
 *
 * This parser uses a state machine, which makes it very fast and efficient.
 */
public class UonParser extends ReaderParser {

	//-------------------------------------------------------------------------------------------------------------------
	// Configurable properties
	//-------------------------------------------------------------------------------------------------------------------

	private static final String PREFIX = "UonParser.";

	/**
	 * <b>Configuration property:</b> Decode <js>"%xx"</js> sequences.
	 *
	 * <ul>
	 * 	<li><b>Name:</b> <js>"UonParser.decodeChars"</js>
	 * 	<li><b>Data type:</b> <code>Boolean</code>
	 * 	<li><b>Default:</b> <jk>false</jk> for {@link UonParser}, <jk>true</jk> for {@link UrlEncodingParser}
	 * 	<li><b>Session-overridable:</b> <jk>true</jk>
	 * </ul>
	 *
	 * <p>
	 * Specify <jk>true</jk> if URI encoded characters should be decoded, <jk>false</jk> if they've already been decoded
	 * before being passed to this parser.
	 */
	public static final String UON_decodeChars = PREFIX + "decodeChars";


	//-------------------------------------------------------------------------------------------------------------------
	// Predefined instances
	//-------------------------------------------------------------------------------------------------------------------

	/** Reusable instance of {@link UonParser}, all default settings. */
	public static final UonParser DEFAULT = new UonParser(PropertyStore.create());

	/** Reusable instance of {@link UonParser} with decodeChars set to true. */
	public static final UonParser DEFAULT_DECODING = new UonParser.Decoding(PropertyStore.create());


	//-------------------------------------------------------------------------------------------------------------------
	// Predefined subclasses
	//-------------------------------------------------------------------------------------------------------------------

	/** Default parser, decoding. */
	public static class Decoding extends UonParser {

		/**
		 * Constructor.
		 *
		 * @param propertyStore The property store containing all the settings for this object.
		 */
		public Decoding(PropertyStore propertyStore) {
			super(propertyStore.copy().append(UON_decodeChars, true));
		}
	}


	//-------------------------------------------------------------------------------------------------------------------
	// Instance
	//-------------------------------------------------------------------------------------------------------------------

	private final UonParserContext ctx;

	/**
	 * Constructor.
	 *
	 * @param propertyStore
	 * 	The property store containing all the settings for this object.
	 */
	public UonParser(PropertyStore propertyStore) {
		this(propertyStore, "text/uon");
	}

	/**
	 * Constructor.
	 *
	 * @param propertyStore
	 * 	The property store containing all the settings for this object.
	 * @param consumes
	 * 	The list of media types that this parser consumes (e.g. <js>"application/json"</js>, <js>"*&#8203;/json"</js>).
	 */
	public UonParser(PropertyStore propertyStore, String...consumes) {
		super(propertyStore, consumes);
		this.ctx = createContext(UonParserContext.class);
	}

	@Override /* CoreObject */
	public UonParserBuilder builder() {
		return new UonParserBuilder(propertyStore);
	}

	/**
	 * Instantiates a new clean-slate {@link UonParserBuilder} object.
	 * 
	 * <p>
	 * This is equivalent to simply calling <code><jk>new</jk> UonParserBuilder()</code>.
	 * 
	 * <p>
	 * Note that this method creates a builder initialized to all default settings, whereas {@link #builder()} copies 
	 * the settings of the object called on.
	 * 
	 * @return A new {@link UonParserBuilder} object.
	 */
	public static UonParserBuilder create() {
		return new UonParserBuilder();
	}

	/**
	 * Create a UON parser session for parsing parameter values.
	 *
	 * @return A new parser session.
	 */
	protected final UonParserSession createParameterSession() {
		return new UonParserSession(ctx, createDefaultSessionArgs(), false);
	}

	@Override /* Parser */
	public UonParserSession createSession(ParserSessionArgs args) {
		return new UonParserSession(ctx, args);
	}
}
