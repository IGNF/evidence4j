package fr.umr.lastig.evidence.iterator;

import junit.framework.Assert;

import org.junit.Test;

import fr.umr.lastig.evidence.iterator.PowerSetIterator;
import fr.umr.lastig.evidence.variable.Variable;
import fr.umr.lastig.evidence.variable.VariableFactory;
import fr.umr.lastig.evidence.variable.VariableSet;

public class PowerSetIteratorTest {

  @Test
  public void testPowerSetIterator() {
    long start = System.currentTimeMillis();
    VariableFactory<String> vf = new VariableFactory<String>();
    Variable<String> var = vf.newVariable();
    var.add("A");
    var.add("B");
    var.add("C");
    VariableSet<String> varSet = new VariableSet<String>(vf);
    varSet.add(var);
    PowerSetIterator<String> iterator = new PowerSetIterator<String>(varSet);
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;
    }
    Assert.assertEquals(7, count);
    long end = System.currentTimeMillis();
    System.out.println("Took " + (end - start) + " ms");
  }

}
