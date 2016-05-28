// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Season1.java

package testenum;


public class Season1
{

    private Season1(String s)
    {
        season = s;
    }

    public static final Season1 SPRING;
    public static final Season1 SUMMER;
    public static final Season1 AUTUMN;
    public static final Season1 WINTER;
    private String season;

    
    public String getSeason() {
		return season;
	}


	public void setSeason(String season) {
		this.season = season;
	}


	@Override
	public String toString() {
		return "Season1 [season=" + season + "]";
	}


	static 
    {
        SPRING = new Season1("SPRING");
        SUMMER = new Season1("SUMMER");
        AUTUMN = new Season1("AUTUMN");
        WINTER = new Season1("WINTER");
    }
}
