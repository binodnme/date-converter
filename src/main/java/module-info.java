/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 10/9/17.
 */
module com.github.binodnme.dateconverter {
    requires java.base;
    requires joda.time;

    exports com.github.binodnme.dateconverter.converter;
    exports com.github.binodnme.dateconverter.utils;
}