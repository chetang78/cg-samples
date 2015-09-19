package com.cg.two;

import javax.jws.WebService;
import javax.jws.WebParam;


@WebService (targetNamespace="http://two.cg.com/ver1.0", serviceName="AddService", portName="AddPort")
public class AddDelegate{

    com.cg.two.Add _add = null;

    public int add (@WebParam(name="val1") int val1, @WebParam(name="val2") int val2) {
        return _add.add(val1,val2);
    }

    public AddDelegate() {
        _add = new com.cg.two.Add(); }

}