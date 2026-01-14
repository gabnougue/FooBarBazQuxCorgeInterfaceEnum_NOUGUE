package com.jad;

import com.jad.IFoo;

public class Corge implements ICorge {
    private IFoo foo;

    public Corge(IFoo foo) {
        this.foo = foo;
    }

    public IFoo getFoo() {
        return this.foo;
    }

    public ICorge setFoo(IFoo foo) {
        this.foo = foo;
        return this;
    }
    
}
