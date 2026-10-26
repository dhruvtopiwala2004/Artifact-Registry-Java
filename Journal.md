# Journal

## Phase 1

In this phase, I created an Artifact class that stores the name and ID of each artifact. I used a static variable to track the total number of artifacts created. I learned that int is a primitive data type that stores whole numbers, while Integer is a wrapper class that can also store null values. Using Integer is helpful when an artifact does not have an assigned ID. I also learned that static variables are shared across all objects of a class.

## Phase 2

In this phase, I added a Universal Cataloging Constant using static final. I used double because the constant contains a decimal value. I learned that static means the variable is shared by all objects of the class. The final keyword prevents the value from being changed after initialization. Unlike instance variables, a static final constant belongs to the class and stays the same for every artifact.

## Phase 3

In this phase, I created an ArtifactCalculator class to calculate the Stability Index. I used Math.abs() to find the absolute difference and Math.sqrt() to calculate the square root. I learned that static methods can be called without creating an object. This is useful for calculations that do not depend on specific object data. I also learned that utility methods help keep the code organized and reusable.

