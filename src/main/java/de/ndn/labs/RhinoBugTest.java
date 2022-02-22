package de.ndn.labs;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;

public class RhinoBugTest
{
    public static void main( String[] args )
    {
        ContextFactory f = new ContextFactory();
        Context c = f.enterContext();
        Scriptable s = c.initStandardObjects();

        String js = "var a = [1, 2]; var b = 0; [a[b+1], a[b]] = [a[b], a[b+1]]; a[0]";
        System.out.println(c.evaluateString(s, js, null, 1, null));
    }
}
