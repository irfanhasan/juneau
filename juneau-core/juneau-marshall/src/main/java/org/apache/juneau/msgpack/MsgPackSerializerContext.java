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
package org.apache.juneau.msgpack;

import static org.apache.juneau.msgpack.MsgPackSerializer.*;

import org.apache.juneau.*;
import org.apache.juneau.serializer.*;

/**
 * Contains a snapshot-in-time read-only copy of the settings on the {@link MsgPackSerializer} class.
 */
public final class MsgPackSerializerContext extends SerializerContext {

	final boolean
		addBeanTypeProperties;

	/**
	 * Constructor.
	 *
	 * <p>
	 * Typically only called from {@link PropertyStore#getContext(Class)}.
	 *
	 * @param ps The property store that created this context.
	 */
	public MsgPackSerializerContext(PropertyStore ps) {
		super(ps);
		addBeanTypeProperties = ps.getProperty(MSGPACK_addBeanTypeProperties, boolean.class,
			ps.getProperty(SERIALIZER_addBeanTypeProperties, boolean.class, true));
	}

	@Override /* Context */
	public ObjectMap asMap() {
		return super.asMap()
			.append("MsgPackSerializerContext", new ObjectMap()
				.append("addBeanTypeProperties", addBeanTypeProperties)
			);
	}
}
