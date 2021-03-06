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
package org.apache.juneau.rest.test;

import org.apache.juneau.html.*;
import org.apache.juneau.rest.client.*;
import org.apache.juneau.uon.*;
import org.apache.juneau.xml.*;
import org.junit.*;

@Ignore
public class LargePojosTest extends RestTestcase {

	private static String URL = "/testLargePojos";
	boolean debug = false;

	//====================================================================================================
	// Test how long it takes to serialize/parse various content types.
	//====================================================================================================
	@Test
	public void test() throws Exception {
		LargePojo p;
		long t;
		RestClient c;

		System.err.println("\n---Testing JSON---");
		c = TestMicroservice.DEFAULT_CLIENT;
		for (int i = 1; i <= 3; i++) {
			t = System.currentTimeMillis();
			p = c.doGet(URL).getResponse(LargePojo.class);
			System.err.println("Download: ["+(System.currentTimeMillis() - t)+"] ms");
			t = System.currentTimeMillis();
			c.doPut(URL, p).run();
			System.err.println("Upload: ["+(System.currentTimeMillis() - t)+"] ms");
		}

		System.err.println("\n---Testing XML---");
		c = TestMicroservice.client(XmlSerializer.class, XmlParser.class).build();
		for (int i = 1; i <= 3; i++) {
			t = System.currentTimeMillis();
			p = c.doGet(URL).getResponse(LargePojo.class);
			System.err.println("Download: ["+(System.currentTimeMillis() - t)+"] ms");
			t = System.currentTimeMillis();
			c.doPut(URL, p).run();
			System.err.println("Upload: ["+(System.currentTimeMillis() - t)+"] ms");
		}

		System.err.println("\n---Testing HTML---");
		c = TestMicroservice.client(HtmlSerializer.class, HtmlParser.class).accept("text/html+stripped").build();
		for (int i = 1; i <= 3; i++) {
			t = System.currentTimeMillis();
			p = c.doGet(URL).getResponse(LargePojo.class);
			System.err.println("Download: ["+(System.currentTimeMillis() - t)+"] ms");
			t = System.currentTimeMillis();
			c.doPut(URL, p).run();
			System.err.println("Upload: ["+(System.currentTimeMillis() - t)+"] ms");
		}

		c.closeQuietly();

		System.err.println("\n---Testing UrlEncoding---");
		c = TestMicroservice.client(UonSerializer.class, UonParser.class).build();
		for (int i = 1; i <= 3; i++) {
			t = System.currentTimeMillis();
			p = c.doGet(URL).getResponse(LargePojo.class);
			System.err.println("Download: ["+(System.currentTimeMillis() - t)+"] ms");
			t = System.currentTimeMillis();
			c.doPut(URL, p).run();
			System.err.println("Upload: ["+(System.currentTimeMillis() - t)+"] ms");
		}

		c.closeQuietly();
	}
}