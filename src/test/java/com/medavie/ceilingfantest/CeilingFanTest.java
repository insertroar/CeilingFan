package com.medavie.ceilingfantest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.medavie.ceilingfan.CeilingFan;
import com.medavie.ceilingfan.Direction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingFanTest {

	private CeilingFan ceilingFan;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ceilingFan = new CeilingFan();
	}

	@Test
	void testSpeedChange() {
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());
		assertEquals(0, ceilingFan.getSpeed());

		ceilingFan.speedIncrease();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());
		System.out.println(ceilingFan.toString());

		ceilingFan.speedIncrease();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());
	}

	@Test
	void testReverseDirection() {
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());
		assertEquals(0, ceilingFan.getSpeed());

		ceilingFan.reverseDirection();
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());
		assertEquals(0, ceilingFan.getSpeed());

		ceilingFan.speedIncrease();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());
	}

	@Test
	void testReverseDirectionSpeedChange() {
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.speedIncrease();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.INCREASE, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.DECREASE, ceilingFan.getDirection());
	}
}