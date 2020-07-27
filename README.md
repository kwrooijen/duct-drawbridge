# Integrant drawbridge

[![Clojars Project](https://img.shields.io/clojars/v/duct-drawbridge.svg)](https://clojars.org/kwrooijen/duct-drawbridge)

## Usage

`project.clj`

```clojure
:dependencies [[kwrooijen/duct-drawbridge "0.1.0"]]
:plugins [[duct/lein-duct "0.12.1"]
          [nrepl/drawbridge "0.2.1"]]
```

`config.edn`

```clojure
{:duct.profile/base
 {:duct.router/reitit
  [["/repl"
    {:get {:handler #ig/ref :duct.handler/drawbridge}
     :post {:handler #ig/ref :duct.handler/drawbridge}
     :middleware [#ig/ref :duct.middleware.drawbridge/auth]}]]

  :duct.handler/drawbridge {}

  :duct.middleware.drawbridge/auth
  {:auth/name "some-name"
   :auth/pass "some-pass"}}}
```

## Author / License

Released under the [MIT License] by [Kevin William van Rooijen].

[Kevin William van Rooijen]: https://twitter.com/kwrooijen

[MIT License]: https://github.com/kwrooijen/gungnir/blob/master/LICENSE
