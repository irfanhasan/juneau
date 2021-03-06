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

import java.util.*;

import org.apache.juneau.*;
import org.apache.juneau.http.*;
import org.apache.juneau.parser.*;

/**
 * Builder class for building instances of MessagePack parsers.
 */
public class MsgPackParserBuilder extends ParserBuilder {

	/**
	 * Constructor, default settings.
	 */
	public MsgPackParserBuilder() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param propertyStore The initial configuration settings for this builder.
	 */
	public MsgPackParserBuilder(PropertyStore propertyStore) {
		super(propertyStore);
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParser build() {
		return new MsgPackParser(propertyStore);
	}


	//--------------------------------------------------------------------------------
	// Properties
	//--------------------------------------------------------------------------------

	@Override /* ParserBuilder */
	public MsgPackParserBuilder trimStrings(boolean value) {
		super.trimStrings(value);
		return this;
	}

	@Override /* ParserBuilder */
	public MsgPackParserBuilder strict(boolean value) {
		super.strict(value);
		return this;
	}

	@Override /* ParserBuilder */
	public MsgPackParserBuilder strict() {
		super.strict();
		return this;
	}

	@Override /* ParserBuilder */
	public MsgPackParserBuilder inputStreamCharset(String value) {
		super.inputStreamCharset(value);
		return this;
	}

	@Override /* ParserBuilder */
	public MsgPackParserBuilder fileCharset(String value) {
		super.fileCharset(value);
		return this;
	}

	@Override /* ParserBuilder */
	public MsgPackParserBuilder listener(Class<? extends ParserListener> value) {
		super.listener(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beansRequireDefaultConstructor(boolean value) {
		super.beansRequireDefaultConstructor(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beansRequireSerializable(boolean value) {
		super.beansRequireSerializable(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beansRequireSettersForGetters(boolean value) {
		super.beansRequireSettersForGetters(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beansRequireSomeProperties(boolean value) {
		super.beansRequireSomeProperties(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanMapPutReturnsOldValue(boolean value) {
		super.beanMapPutReturnsOldValue(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanConstructorVisibility(Visibility value) {
		super.beanConstructorVisibility(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanClassVisibility(Visibility value) {
		super.beanClassVisibility(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanFieldVisibility(Visibility value) {
		super.beanFieldVisibility(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder methodVisibility(Visibility value) {
		super.methodVisibility(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder useJavaBeanIntrospector(boolean value) {
		super.useJavaBeanIntrospector(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder useInterfaceProxies(boolean value) {
		super.useInterfaceProxies(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder ignoreUnknownBeanProperties(boolean value) {
		super.ignoreUnknownBeanProperties(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder ignoreUnknownNullBeanProperties(boolean value) {
		super.ignoreUnknownNullBeanProperties(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder ignorePropertiesWithoutSetters(boolean value) {
		super.ignorePropertiesWithoutSetters(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder ignoreInvocationExceptionsOnGetters(boolean value) {
		super.ignoreInvocationExceptionsOnGetters(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder ignoreInvocationExceptionsOnSetters(boolean value) {
		super.ignoreInvocationExceptionsOnSetters(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder sortProperties(boolean value) {
		super.sortProperties(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder notBeanPackages(String...values) {
		super.notBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder notBeanPackages(Collection<String> values) {
		super.notBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setNotBeanPackages(String...values) {
		super.setNotBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setNotBeanPackages(Collection<String> values) {
		super.setNotBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeNotBeanPackages(String...values) {
		super.removeNotBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeNotBeanPackages(Collection<String> values) {
		super.removeNotBeanPackages(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder notBeanClasses(Class<?>...values) {
		super.notBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder notBeanClasses(Collection<Class<?>> values) {
		super.notBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setNotBeanClasses(Class<?>...values) {
		super.setNotBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setNotBeanClasses(Collection<Class<?>> values) {
		super.setNotBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeNotBeanClasses(Class<?>...values) {
		super.removeNotBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeNotBeanClasses(Collection<Class<?>> values) {
		super.removeNotBeanClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanFilters(Class<?>...values) {
		super.beanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanFilters(Collection<Class<?>> values) {
		super.beanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setBeanFilters(Class<?>...values) {
		super.setBeanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setBeanFilters(Collection<Class<?>> values) {
		super.setBeanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeBeanFilters(Class<?>...values) {
		super.removeBeanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeBeanFilters(Collection<Class<?>> values) {
		super.removeBeanFilters(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder pojoSwaps(Class<?>...values) {
		super.pojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder pojoSwaps(Collection<Class<?>> values) {
		super.pojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setPojoSwaps(Class<?>...values) {
		super.setPojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setPojoSwaps(Collection<Class<?>> values) {
		super.setPojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removePojoSwaps(Class<?>...values) {
		super.removePojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removePojoSwaps(Collection<Class<?>> values) {
		super.removePojoSwaps(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder implClasses(Map<Class<?>,Class<?>> values) {
		super.implClasses(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public <T> MsgPackParserBuilder implClass(Class<T> interfaceClass, Class<? extends T> implClass) {
		super.implClass(interfaceClass, implClass);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanDictionary(Class<?>...values) {
		super.beanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanDictionary(Collection<Class<?>> values) {
		super.beanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setBeanDictionary(Class<?>...values) {
		super.setBeanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder setBeanDictionary(Collection<Class<?>> values) {
		super.setBeanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeFromBeanDictionary(Class<?>...values) {
		super.removeFromBeanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeFromBeanDictionary(Collection<Class<?>> values) {
		super.removeFromBeanDictionary(values);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder beanTypePropertyName(String value) {
		super.beanTypePropertyName(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder defaultParser(Class<?> value) {
		super.defaultParser(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder locale(Locale value) {
		super.locale(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder timeZone(TimeZone value) {
		super.timeZone(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder mediaType(MediaType value) {
		super.mediaType(value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder debug() {
		super.debug();
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder property(String name, Object value) {
		super.property(name, value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder properties(Map<String,Object> properties) {
		super.properties(properties);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder addToProperty(String name, Object value) {
		super.addToProperty(name, value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder putToProperty(String name, Object key, Object value) {
		super.putToProperty(name, key, value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder putToProperty(String name, Object value) {
		super.putToProperty(name, value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder removeFromProperty(String name, Object value) {
		super.removeFromProperty(name, value);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder classLoader(ClassLoader classLoader) {
		super.classLoader(classLoader);
		return this;
	}

	@Override /* CoreObjectBuilder */
	public MsgPackParserBuilder apply(PropertyStore copyFrom) {
		super.apply(copyFrom);
		return this;
	}
}