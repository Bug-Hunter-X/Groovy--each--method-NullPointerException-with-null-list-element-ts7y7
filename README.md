# Groovy 'each' method NullPointerException with null list element

This repository demonstrates a NullPointerException that can occur when using Groovy's `each` method on a list containing null values.  The `each` method iterates through the list and attempts to call the closure on each element. If any element is null, this will lead to a NullPointerException.

The provided example shows the issue and the solution.  The solution involves adding a simple null check within the `each` closure, effectively handling null values gracefully.