# jsonread
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Javadoc](http://javadoc-badge.appspot.com/org.eleusoft/jsonread_1.0.0.svg?label=Javadoc)](https://eleusoft.github.io/jsonread/apidocs/)

A minimal, <b>source-centric API to build an object model from a serialized JSON Object</b>, with implementations for most (Java) JSON parsers.

## Purpose

<p>The main purpose of the <em>JsonRead API</em> is to isolate a common functionality needed by many binding applications in one <A href='#simple'>simple</a> but <A href='#complete'>complete</a> API that has many different <A href='#implementations'>implementations</a>.

<p>The <em>JsonRead</em> API is meant for a low level client that must parse a serialized JSON Object
and access through a complete object model the JSON Values contained in it, an example is a generic binding processor.

<p>The <em>JsonRead</em> API is <em>not meant</em> for a high level client that wants to easily bound Java types 
to values serialized in some JSON  (Eg: no accessors to bound values like <code>getDouble(key)</code> or <code>getString(key)</code>).

<p>The <em>JsonRead</em> API is also a way to test performance and correctness of the available JSON parsers.

### Simple

<p>The <em>JsonRead API</em> is tiny and simple to use and also simple to implement: it takes an hour to wrap an implementation.

### Complete

<p>The <em>JsonRead API</em> representsa JSON with an object model
that fully supports the concepts present in the <A href='https://tools.ietf.org/html/rfc7159'>JSON Specification</A>,
in this is similar to the 
<A target='_blank' href='https://json-processing-spec.java.net/nonav/releases/1.0/pfd-draft/javadocs/index.html'>javax.json</A> API
but:
	<ol>
	<li><em>JsonRead</em> supports only parsing and not serialization.
	<li><em>JsonRead</em> supports only parsing to an object model, has no streaming API.
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
	<li><p><A target='_blank' href='https://json-lib.sourceforge.net/'>Json-lib (net.sf.json)</A>
	<li><p><A target='_blank' href='https://github.com/google/gson'>Gson</A>
	<li><p><A target='_blank' href='https://sourceforge.net/projects/argo/'>Argo</A>
	<li><p><A target='_blank' href='https://bitbucket.org/jmarsden/jsonij/wiki/Home'>Jsonij</A>
	<li><p><A target='_blank' href='https://bolerio.github.io/mjson/'>Mjson</A>
	<li><p><A target='_blank' href='https://sourceforge.net/projects/fastjson/'>Fastjson</A>
	<li><p><A target='_blank' href='https://github.com/billdavidson/JSONUtil'>JSONUtil</a>
	<li><p><A target='_blank' href='http://code.grobmeier.de/jjson/'>JJSON</a>
	<li><p><A target='_blank' href='http://cookjson.yuanheng.org/'>Cookjson</a>
	<li><p><A target='_blank' href='https://owlike.github.io/genson/'>Genson</a>
	<li><p><A target='_blank' href='https://github.com/netplex/json-smart-v2'>Json-Smart V.2</a>
	<li><p><A target='_blank' href='http://johnzon.apache.org/'>Apache Johnzon</a>
	<li><p><A target='_blank' href='https://github.com/ralfstx/minimal-json'>Minimal-json</a>
        <li><p><A target='_blank' href='https://github.com/boonproject/boon'>Boon</a>
		
	
</ul>

<!-- table totals -->
<TABLE border cellspacing=0><TR><TD colspan=99><TR><th></th><th>Elapsed</th><th>% of Tot</th><th>% of Min</th><th>% of Max</th><th width=300></th></TR>
<TR><TD>JsonReadProviderJackson</TD><TD align=right>4441</TD><TD align=right>5,53%</TD><TD align=right>100,00%</TD><TD align=right>36,68%</TD><td></td></TR>
<TR><TD>JsonReadProviderLazyjson</TD><TD align=right>4947</TD><TD align=right>6,16%</TD><TD align=right>111,39%</TD><TD align=right>40,85%</TD><td></td></TR>
<TR><TD>JsonReadProviderMinimaljson</TD><TD align=right>5080</TD><TD align=right>6,32%</TD><TD align=right>114,39%</TD><TD align=right>41,95%</TD><td></td></TR>
<TR><TD>JsonReadProviderGlassfish</TD><TD align=right>6762</TD><TD align=right>8,42%</TD><TD align=right>152,26%</TD><TD align=right>55,84%</TD><td></td></TR>
<TR><TD>JsonReadProviderJohnzon</TD><TD align=right>8141</TD><TD align=right>10,13%</TD><TD align=right>183,31%</TD><TD align=right>67,23%</TD><td></td></TR>
<TR><TD>JsonReadProviderFastjson</TD><TD align=right>8722</TD><TD align=right>10,86%</TD><TD align=right>196,40%</TD><TD align=right>72,03%</TD><td></td></TR>
<TR><TD>JsonReadProviderCookjson</TD><TD align=right>9897</TD><TD align=right>12,32%</TD><TD align=right>222,86%</TD><TD align=right>81,73%</TD><td></td></TR>
<TR><TD>JsonReadProviderGson</TD><TD align=right>9515</TD><TD align=right>11,85%</TD><TD align=right>214,25%</TD><TD align=right>78,58%</TD><td></td></TR>
<TR><TD>JsonReadProviderNanojson</TD><TD align=right>10714</TD><TD align=right>13,34%</TD><TD align=right>241,25%</TD><TD align=right>88,48%</TD><td></td></TR>
<TR><TD>JsonReadProviderMjson</TD><TD align=right>12109</TD><TD align=right>15,07%</TD><TD align=right>272,66%</TD><TD align=right>100,00%</TD><td></td></TR>
</TABLE>

## *License*

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

