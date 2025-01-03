```groovy
def myMethod(List<String> list) {
  list.each { it ->
    if (it != null) {
      println it
    }
  }
}

myMethod(['a', 'b', null, 'd'])
```