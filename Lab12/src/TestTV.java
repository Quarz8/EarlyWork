// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			12_2

public class TestTV
{
	public static void main(String[] args)
	{
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();

		System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);

		TV tv3 = new TV();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.turnOn();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.setChannel(69);
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.setVolume(6);
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.channelUp();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.channelDown();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.volumeUp();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.volumeDown();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
		tv3.turnOff();
		System.out.println(
				"tv3 is on: " + tv3.on + ", channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
	}
}
