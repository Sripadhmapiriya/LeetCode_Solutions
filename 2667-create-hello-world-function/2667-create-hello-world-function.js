/**
 * @return {Function}
 */
var createHelloWorld = function() {
   
    return () => "Hello World";

    
    return function(...args) {
         console.log(createHelloWorld());
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */