# dynamic-binding-java

Dog is the parent (superclass).

Puppy is the child (subclass) that overrides bark().

The object created is of type Puppy, but it is referenced using the Dog type.

At runtime, Java decides which bark() method to execute.

Since the actual object is Puppy, Puppy.bark() is executed, not Dog.bark().
