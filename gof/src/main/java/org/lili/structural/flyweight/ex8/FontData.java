package org.lili.structural.flyweight.ex8;

import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * Created by lili on 2017/7/11.
 */
//https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Flyweight
public final class FontData {

    enum FontEffect {
        BOLD, ITALIC, SUPERSCRIPT, SUBSCRIPT, STRIKETHROUGH;
    }

    /**
     * A weak hash map will drop unused references to FontData.
     * Values have to be wrapped in WeakReferences,
     * because value objects in weak hash map are held by strong references.
     */
    private static final WeakHashMap<FontData,WeakReference<FontData>> FLY_WEIGHT_DATA=
            new WeakHashMap<FontData, WeakReference<FontData>>();


    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;


    public FontData(int pointSize, String fontFace, Color color, Set<FontEffect> effects) {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = effects;
    }

    public static FontData create(int pointSize,String fontFace,Color color,FontEffect... effects){
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        for(FontEffect fontEffect: effects){
            effectsSet.add(fontEffect);
        }
        FontData data = new FontData(pointSize, fontFace, color, effectsSet);
        FontData result = null;
        WeakReference<FontData> ref = FLY_WEIGHT_DATA.get(data);
        if(ref!=null){
            result = ref.get();
        }
        if(result==null){
            FLY_WEIGHT_DATA.put(data,new WeakReference<FontData>(data));
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FontData) {
            if (obj == this) {
                return true;
            }
            FontData other = (FontData) obj;
            return other.pointSize == pointSize && other.fontFace.equals(fontFace)
                    && other.color.equals(color) && other.effects.equals(effects);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return (pointSize * 37 + effects.hashCode() * 13) * fontFace.hashCode();
    }
    // Getters for the font data, but no setters. FontData is immutable.

    public static void main(String[] args) {
        FontData f1 = FontData.create(1, "ww", Color.black, FontEffect.BOLD);
        FontData f2 = FontData.create(1, "ww", Color.black, FontEffect.BOLD);
        FontData f3 = FontData.create(1, "ww", Color.black, FontEffect.BOLD);
        System.out.println(f1==f3);
    }
}
