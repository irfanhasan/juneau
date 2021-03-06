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
package org.apache.juneau.csv;

import org.apache.juneau.*;
import org.apache.juneau.parser.*;

/**
 * TODO - Work in progress.  CSV parser.
 */
public class CsvParser extends ReaderParser {

	//-------------------------------------------------------------------------------------------------------------------
	// Predefined instances
	//-------------------------------------------------------------------------------------------------------------------

	/** Default parser, all default settings.*/
	public static final CsvParser DEFAULT = new CsvParser(PropertyStore.create());


	//-------------------------------------------------------------------------------------------------------------------
	// Instance
	//-------------------------------------------------------------------------------------------------------------------

	private final CsvParserContext ctx;

	/**
	 * Constructor.
	 *
	 * @param propertyStore The property store containing all the settings for this object.
	 */
	public CsvParser(PropertyStore propertyStore) {
		super(propertyStore, "text/csv");
		this.ctx = createContext(CsvParserContext.class);
	}

	@Override /* CoreObject */
	public CsvParserBuilder builder() {
		return new CsvParserBuilder(propertyStore);
	}

	/**
	 * Instantiates a new clean-slate {@link CsvParserBuilder} object.
	 * 
	 * <p>
	 * This is equivalent to simply calling <code>CsvParser.create()
	 * 
	 * <p>
	 * Note that this method creates a builder initialized to all default settings, whereas {@link #builder()} copies 
	 * the settings of the object called on.
	 * 
	 * @return A new {@link CsvParserBuilder} object.
	 */
	public static CsvParserBuilder create() {
		return new CsvParserBuilder();
	}

	@Override /* Parser */
	public ReaderParserSession createSession(ParserSessionArgs args) {
		return new CsvParserSession(ctx, args);
	}
}
