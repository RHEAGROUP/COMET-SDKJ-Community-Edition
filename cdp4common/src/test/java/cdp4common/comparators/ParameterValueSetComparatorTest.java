/*
 * ParameterValueSetComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterValueSetComparatorTest {
    private Iteration iteration;

    private Option optionA;

    private Option optionB;

    private ActualFiniteState actualFiniteStateA;

    private ActualFiniteState actualFiniteStateB;

    @BeforeEach
    void setUp() {
        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.optionA = new Option(UUID.randomUUID(), null, null);
        this.optionA.setName("option a");
        this.optionA.setShortName("optionB");
        this.optionB = new Option(UUID.randomUUID(), null, null);
        this.optionB.setName("option b");
        this.optionB.setShortName("optionB");
        this.iteration.getOption().add(this.optionB);
        this.iteration.getOption().add(this.optionA);

        var possibleFiniteStateList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        var possibleFiniteStateA = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateA.setName("state a");
        possibleFiniteStateA.setShortName("statea");
        var possibleFiniteStateB = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateB.setName("state b");
        possibleFiniteStateB.setShortName("stateb");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateB);
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateA);
        this.iteration.getPossibleFiniteStateList().add(possibleFiniteStateList);

        var actualFiniteStateList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
        this.actualFiniteStateA = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualFiniteStateA.getPossibleState().add(possibleFiniteStateA);
        this.actualFiniteStateB = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualFiniteStateB.getPossibleState().add(possibleFiniteStateB);
        actualFiniteStateList.getActualState().add(this.actualFiniteStateB);
        actualFiniteStateList.getActualState().add(this.actualFiniteStateA);
        this.iteration.getActualFiniteStateList().add(actualFiniteStateList);
    }

    @Test
    void verifyThatOptionDependentValueSetsComparatorCompareReturnsExpectedResults() {
        var valueSetA = new ParameterValueSet();
        valueSetA.setActualOption(this.optionA);
        var valueSetB = new ParameterValueSet();
        valueSetB.setActualOption(this.optionB);

        var comparator = new ParameterValueSetComparator();
        var comparisonAB = comparator.compare(valueSetA, valueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparator.compare(valueSetB, valueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparator.compare(valueSetA, valueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparator.compare(valueSetB, valueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var valueSetA = new ParameterValueSet();
        valueSetA.setActualState(this.actualFiniteStateA);
        var valueSetB = new ParameterValueSet();
        valueSetB.setActualState(this.actualFiniteStateB);

        var comparator = new ParameterValueSetComparator();
        var comparisonAB = comparator.compare(valueSetA, valueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparator.compare(valueSetB, valueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparator.compare(valueSetA, valueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparator.compare(valueSetB, valueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionDepStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var aa = new ParameterValueSet();
        aa.setActualOption(this.optionA);
        aa.setActualState(this.actualFiniteStateA);

        var ab = new ParameterValueSet();
        ab.setActualOption(this.optionA);
        ab.setActualState(this.actualFiniteStateB);

        var ba = new ParameterValueSet();
        ba.setActualOption(this.optionB);
        ba.setActualState(this.actualFiniteStateA);

        var bb = new ParameterValueSet();
        bb.setActualOption(this.optionB);
        bb.setActualState(this.actualFiniteStateB);

        var comparator = new ParameterValueSetComparator();

        var comparison_aa_ab = comparator.compare(aa, ab);
        assertEquals(1, comparison_aa_ab);

        var comparison_aa_bb = comparator.compare(aa, bb);
        assertEquals(1, comparison_aa_bb);
    }
}