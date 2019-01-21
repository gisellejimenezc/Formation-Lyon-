package com.jeuRoles.model;

import org.junit.Assert;
import org.junit.Test;

public class OrcTest {

	@Test
	public void testOrcShort() {
		Orc c = new Orc(2, 2, "Hank");
		Assert.assertNotNull(c);
		Assert.assertTrue(c.getX() == 2);
		Assert.assertTrue(c.getY() == 2);
	}

	@Test
	public void testOrcLong() {
		Orc c = new Orc(5, 6, "Lino", 20, 10, 20, 10, 10, 10, 10, 10, 10);
		Assert.assertNotNull(c);
		Assert.assertTrue(c.getX() == 5);
		Assert.assertTrue(c.getY() == 6);
	}

	@Test
	public void testAttack() {
		Orc orc = new Orc(5, 6, "Jojo", 20, 10, 20, 10, 10, 10, 10, 10, 10);
		Human human = new Human(5, 0, "Lolo", 20, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.attack(human);
		org.junit.Assert.assertTrue(human.getHealthPoint() == 0);
		Orc orchy = new Orc(5, 0, "Orchy", 20, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.attack(orchy);
		System.out.println(orchy.getHealthPoint());
		org.junit.Assert.assertTrue(orchy.healthPoint == 5);
	}

	@Test
	public void testGoRight() {
		Orc orc = new Orc(5, 6, "Jojo", 20, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.goRight(5);
		org.junit.Assert.assertTrue(orc.getX() ==10);
	}

	@Test
	public void testGoLeft() {
		Orc orc = new Orc(5, 6, "Jojo", 5, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.goLeft(5);
		org.junit.Assert.assertTrue(orc.getX() == 0);
	}

	@Test
	public void testGoUp() {
		Orc orc = new Orc(5, 6, "Jojo", 5, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.goUp(5);
		org.junit.Assert.assertTrue(orc.getY() == 11);
	}

	@Test
	public void testGoDown() {
		Orc orc = new Orc(5, 6, "Jojo", 5, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.goDown(5);
		org.junit.Assert.assertTrue(orc.getY() == 1);
	}

	@Test
	public void testTakeDamage() {
		Orc orc = new Orc(5, 6, "Jojo", 5, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.takeDamage(5);
		org.junit.Assert.assertTrue(orc.getHealthPoint() == 5);
	}

	@Test
	public void testHeal() {
		Orc orc = new Orc(5, 6, "Jojo", 5, 10, 20, 10, 10, 10, 10, 10, 10);
		orc.heal(5);
		org.junit.Assert.assertTrue(orc.getHealthPoint() == 15);
	}

}
