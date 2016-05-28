// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   EnumTest.java

package enums;


enum Size
{
    SMALL("SMALL"), 
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    EXTRA_LARGE("EXTRA_LARGE");

    private String size;
    private Size(String size){
    	this.size = size;
    }
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
    
}
