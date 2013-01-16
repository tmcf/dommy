(defproject prismatic/dommy "0.0.1"
  :description "No nonsense Clojurescript dom templating and (soon) manipulation"
  :url "https://github.com/prismatic/dommy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:url "git@github.com:prismatic/dommy.git"}
  :pom-addition [:developers [:developer
                              [:name "Prismatic"]
                              [:url "http://prismatic.com"]
                              [:email "admin+oss@prismatic.com"]
                              [:timezone "-8"]]]
  :plugins [[lein-cljsbuild "0.2.10"]]
  :dependencies [[crate "0.2.3" :scope "dev"]] ;; for perf test
  :hooks [leiningen.cljsbuild]
  :cljsbuild 
    {:builds 
     {:dev  {:source-path "src"
             :compiler {:output-to "target/main.js"
                        :optimizations :whitespace
                        :pretty-print true}}
      :test {:source-path "test"
             :compiler {:output-to "target/unit-test.js"
                        :optimizations :whitespace
                        :pretty-print true}}}
     :test-commands {"unit" ["phantomjs" "target/unit-test.js"]}}
)