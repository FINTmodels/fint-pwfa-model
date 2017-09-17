# Play-With-FINT-Adapter models

```groovy
repositories {
    maven {
        url  "http://dl.bintray.com/fint/maven" 
    }
}

compile('no.fint:fint-pwfa-model:0.0.3')
```

This is the model we're using in the Play-With-FINT-Adapter service. It containts of two models:

* Dog
* Owner

A dog can have an owners and and owner can have dogs.

To Play-With-FINT-Adapter [see](https://fintprosjektet.github.io/adapter/)