package com.lichao.java_qq_voice;

/**
 * 音频处理特效类
 * @author LiChao 
 *
 */
public class EffectUtils {
	
	//特效音效类型
	public static final int MODE_NORMAL = 0;
	public static final int MODE_LUOLI = 1;
	public static final int MODE_DASHU = 2;
	public static final int MODE_JINGSONG = 3;
	public static final int MODE_GAOGUAI = 4;
	public static final int MODE_KONGLING = 5;

	/**
	 * 音效处理
	 * @param path 音频路径
	 * @param type 特效类型
	 */
	public native static void fix(String path, int type);

	static {
		System.loadLibrary("fmodL");
		System.loadLibrary("fmod");
		System.loadLibrary("JavaQQvoice");
	}
		
}
