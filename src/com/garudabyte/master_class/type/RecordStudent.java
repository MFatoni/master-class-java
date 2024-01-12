package com.garudabyte.master_class.type;

public record RecordStudent(String id, String name, String dateOfBirth, String classList) {

}

/*
record
-> plain data carriers
-> special class that contains data, that's not meant to be altered
-> it seeks to achieve immutability, for the data in its members
-> in contains only the most fundamental methods, such as constructors and accessors
-> record doesn't have or support setter methods
-> record implicitly calling constructor and printing data out

public record LPAStudent(String id, String name, String dateOfBirth, String classList){}
-> the part that's in parentheses, is called the record header
-> the record header consists of record components, a comma delimited list of components
-> for each component in the header java generates:
-> a field with the same name and declared type as the record component
-> the field declared private and final
-> the field is sometimes referred to as a component field
-> java generates a toString method that prints out each attribute in a formatted String
-> in addition to creating a private final field for each component, java generates a public accessor method for each component
-> this method has the same name and type of the component, but it doesn't have any kind of special prefix, no get, or is, for example
-> the accessor method, for id in this example, is simply id()
-> there are more use cases for immutable dto, and keeping them well encapsulated
-> you want to protect the data from unintended mutations
*/