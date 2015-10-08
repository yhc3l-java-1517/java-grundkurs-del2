package se.coredev.oop.exceptions.model;

public final class Lecture
{
	private final String lectureId;
	private final int lectureLength;
	private final String topic;

	public Lecture(String lectureId, int lectureLength, String topic)
	{
		this.lectureId = lectureId;
		this.lectureLength = lectureLength;
		this.topic = topic;
	}

	public String getLectureId()
	{
		return lectureId;
	}

	public int getLectureLength()
	{
		return lectureLength;
	}

	public String getTopic()
	{
		return topic;
	}

}
