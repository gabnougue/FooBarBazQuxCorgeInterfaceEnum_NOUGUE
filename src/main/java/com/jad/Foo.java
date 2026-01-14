package com.jad;

import java.util.ArrayList;
import java.util.List;

import com.jad.Grault;
import com.jad.IQux;

public class Foo implements IFoo {
    private IBaz baz;
    private List<IBar> bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    public IBaz getBaz() {
        return baz;
    }
    public List<IBar> getBars() {
        return bars;
    }
    public IQux getQux() {
        return qux;
    }
    public void setQux(IQux qux) {
        this.qux = qux;
    }
    public ICorge getCorge() {
        return corge;
    }
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }
}
