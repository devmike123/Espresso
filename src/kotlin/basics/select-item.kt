// To select an item:

onData(allOf(`is`(instanceOf(String::class.java)),
        `is`("Americano"))).perform(click())
