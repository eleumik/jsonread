# jsonread
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Javadoc](http://javadoc-badge.appspot.com/org.eleusoft/jsonread_1.0.0.svg?label=Javadoc)](https://eleumik.github.io/jsonread/apidocs/)

A minimal, source-centric API for building an object model from a serialized JSON Object, with implementations for most (Java) JSON parsers.

## Purpose

<p>The main purpose of the <em>JsonRead API</em> is to isolate a common functionality needed by many binding applications in one <A href='#simple'>simple</a> but [complete](#complete) API so that different [implementations](#implementations) can be used and/or tested.

<p>The <em>JsonRead</em> API is meant for a low level client that must parse a serialized JSON Object
and access through a complete object model the JSON Values contained in it, an example is a generic binding processor.

<p>The <em>JsonRead</em> API is <em>not meant</em> for a high level client that wants to easily bound Java types 
to values serialized in some JSON  (Eg: no specialized accessors like getBoolean(key), getLong(key)).

<p>The <em>JsonRead</em> API is also a way to test performance and correctness of many different JSON parsers available.

### Simple

<p>The <em>JsonRead API</em> is simple to use and simple to implement.

### Complete

<p>The <em>JsonRead API</em>
represent a JSON Document with an Object Model
that fully supports the concepts present in the <A href='https://tools.ietf.org/html/rfc7159'>JSON Specification</A>,
in this is similar to the 
<A target='_blank' href='https://json-processing-spec.java.net/nonav/releases/1.0/pfd-draft/javadocs/index.html'>javax.json</A> API
but:
	<ol>
	<li><em>JsonRead</em> supports only parsing and only to an object model (no streaming).
	<li><em>JsonRead</em> prescribes to the implementation to maintain the lexical value of a JSON Number as found in the source 
	</ol>
	


## Implementations

<p>There are implementations of the <em>JsonRead API</em> for the following (Java) JSON Parsers:

<ul>
	<li><p><A target='_blank' href='https://github.com/doubledutch/LazyJSON'>doubledutch LazyJSON</A>
	<li><p><A target='_blank' href='https://github.com/FasterXML/jackson'>Jackson</A>
	<li><p>Any parser that implements the <A href='https://docs.oracle.com/javaee/7/api/javax/json/package-summary.html'>javax.json</A> 
	API of <a target='_blank' href='https://jsonp.java.net/'>JSR 353</a>
	<li><p><A target='_blank' href='https://github.com/stleary/JSON-java'>JSON in Java [package org.json]</A>
	<li><p><A target='_blank' href='http://json-lib.sourceforge.net/'>Json-lib (net.sf.json)</A>
	<li><p><A target='_blank' href='https://github.com/google/gson'>Gson</A>
	<li><p><A target='_blank' href='https://sourceforge.net/projects/argo/'>Argo</A>
	<li><p><A target='_blank' href='https://bitbucket.org/jmarsden/jsonij/wiki/Home'>Jsonij</A>
	<li><p><A target='_blank' href='http://bolerio.github.io/mjson/'>Mjson</A>
	<li><p><A target='_blank' href='https://sourceforge.net/projects/fastjson/'>Fastjson</A>
	<li><p><A target='_blank' href='https://github.com/billdavidson/JSONUtil'>JSONUtil</a>
	<li><p><A target='_blank' href='http://code.grobmeier.de/jjson/'>JJSON</a>
	<li><p><A target='_blank' href='http://cookjson.yuanheng.org/'>Cookjson</a>
	<li><p><A target='_blank' href='http://owlike.github.io/genson/'>Genson</a>
	<li><p><A target='_blank' href='https://github.com/netplex/json-smart-v2'>Json-Smart V.2</a>
	<li><p><A target='_blank' href='http://johnzon.apache.org/'>Apache Johnzon</a>
	<li><p><A target='_blank' href='https://github.com/ralfstx/minimal-json'>Minimal-json</a>
	
	
</ul>

###*License*

Jsonread is released under the [Apache 2.0 license](license.txt).


```
Copyright 2017 Michele Vivoda

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

