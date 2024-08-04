package fr.umr.lastig.evidence.delayedmassvaluation;

public interface MassFunctor<E> {
  double evaluate(E event);
}
