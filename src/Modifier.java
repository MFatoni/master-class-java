public class Modifier {
    public static void main(String[] args) {

//        local variable
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

/*
Class
- custom data type
- special code block that contains method
Object
- instance of particular class

static field
- required static keyword when declare on the class
- value of the field is stored in special memory location and only in one place
- value is accessed by ClassName.fieldname example Integer.MAX_VALUE

static method
- require static keyword when declared on the class
- method is accessed by ClassName.methodname Integer.parseInt("123");

instance field
- omits 'static' keyword when declared on the class
- value of the field is not allocated any memory and has no value until the object is created
- value is accesed by ObjectVariable.fieldname "hello".toUpperCase();

instance method
- omits 'static' keyword when declared on the class
- method is accessed by ObjectVariable.methodName "hello".toUpperCase();
 */