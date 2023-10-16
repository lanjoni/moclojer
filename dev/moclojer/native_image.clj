(ns moclojer.native-image
  (:require [clojure.string :as string]))

(def initialize-at-build-time
  "list of classes to initialize at build time"
  (str
   "--initialize-at-build-time="
   (string/join
    ","
    ["org.yaml.snakeyaml.DumperOptions$FlowStyle"
     "org.yaml.snakeyaml.DumperOptions$ScalarStyle"
     "com.fasterxml.jackson.core.io.CharTypes"
     "com.fasterxml.jackson.dataformat.cbor.CBORFactory"
     "org.apache.poi.hssf.usermodel.HSSFCellStyle"
     "org.eclipse.jetty.util.log.Log"
     "org.eclipse.jetty.http2.hpack.HpackEncoder"
     "org.eclipse.jetty.http.HttpHeader"
     "com.fasterxml.jackson.core.JsonFactory"
     "org.eclipse.jetty.http.PreEncodedHttpField$1"
     "org.eclipse.jetty.util.StringUtil"
     "org.eclipse.jetty.util.component.AbstractLifeCycle"
     "com.fasterxml.jackson.core.JsonGenerator"
     "org.eclipse.jetty.util.BufferUtil"
     "io.opentracing.util.GlobalTracer"
     "org.eclipse.jetty.http.DateGenerator"
     "org.eclipse.jetty.util.Uptime"
     "org.eclipse.jetty.http.HttpVersion"
     "org.eclipse.jetty.server.Response"
     "org.eclipse.jetty.http2.hpack.HpackContext$1"
     "org.eclipse.jetty.http.HttpScheme"
     "org.eclipse.jetty.http.PreEncodedHttpField"
     "com.fasterxml.jackson.dataformat.smile.SmileFactory"
     "org.eclipse.jetty.util.ssl.SslContextFactory"
     "org.eclipse.jetty.http.HttpMethod"
     "com.fasterxml.jackson.core.io.SerializedString"
     "org.eclipse.jetty.http2.hpack.Huffman"
     "org.eclipse.jetty.http2.hpack.HpackContext"
     "org.slf4j.LoggerFactory"
     "org.eclipse.jetty.util.log.JettyAwareLogger"
     "org.slf4j.jul.JDK14LoggerAdapter"
     "com.fasterxml.jackson.core.io.JsonStringEncoder"
     "org.slf4j.jul.JDK14LoggerAdapter$1"])))