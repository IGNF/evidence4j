package fr.umr.lastig.evidence.delayedmassvaluation;

public class MassDivide<E> implements MassFunctor<E> {
  MassFunctor<E> m1;
  MassFunctor<E> m2;
  public MassDivide(MassFunctor<E> m1, MassFunctor<E> m2) {
    this.m1 = m1;
    this.m2 = m2;
  }
  @Override
  public double evaluate(E event) {
    return this.m1.evaluate(event) / this.m2.evaluate(event);
  }
}
