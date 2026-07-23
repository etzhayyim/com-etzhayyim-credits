(require 'clojure.test)
(load-file "methods/engi.cljc")
(load-file "methods/test_engi.cljc")
(let [result (clojure.test/run-tests 'credits.methods.test-engi)]
  (when (pos? (+ (:fail result) (:error result)))
    (System/exit 1)))
