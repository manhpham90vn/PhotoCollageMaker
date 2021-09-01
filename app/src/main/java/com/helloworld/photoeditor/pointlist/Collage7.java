package com.helloworld.photoeditor.pointlist;

import android.graphics.PointF;

import java.util.ArrayList;

public class Collage7 extends Collage {
    public static int shapeCount = 7;

    public Collage7(int i, int j) {
        this.collageLayoutList = new ArrayList();
        PointF[] apointf = new PointF[4];
        ArrayList obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(0.6f * ((float) i), 0.4166667f * ((float) j)), new PointF(0.6f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, 0.4166667f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.6f * ((float) i), 0.4166667f * ((float) j)), new PointF(((float) i) * 1.0f, 0.4166667f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.6f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f), new PointF(0.7333333f * ((float) i), ((float) j) * 1.0f), new PointF(0.7333333f * ((float) i), 0.4166667f * ((float) j)), new PointF(((float) i) * 0.3333333f, 0.4166667f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.7333333f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.4166667f * ((float) j)), new PointF(0.7333333f * ((float) i), 0.4166667f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.25f * ((float) i), ((float) j) * 1.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), ((float) j) * 0.0f), new PointF(0.25f * ((float) i), 0.5f * ((float) j)), new PointF(0.5f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(0.5f * ((float) i), ((float) j) * 0.0f), new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(0.75f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(0.75f * ((float) i), 0.5f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(0.25f * ((float) i), 0.5f * ((float) j)), new PointF(0.25f * ((float) i), ((float) j) * 1.0f), new PointF(0.5f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), 0.5f * ((float) j)), new PointF(0.75f * ((float) i), 0.5f * ((float) j)), new PointF(0.75f * ((float) i), ((float) j) * 1.0f), new PointF(0.5f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.75f * ((float) i), 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(0.75f * ((float) i), ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.5f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(0.5f * ((float) i), ((float) j) * 0.6666667f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.5f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.6666667f, 0.75f * ((float) j)), new PointF(((float) i) * 0.6666667f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.3333333f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.6666667f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.6666667f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 0.6666667f), new PointF(((float) i) * 0.3333333f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.2916667f * ((float) i), ((float) j) * 0.0f), new PointF(0.2916667f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.2916667f * ((float) i), 0.75f * ((float) j)), new PointF(0.2916667f * ((float) i), ((float) j) * 0.0f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.0f), new PointF(0.5833333f * ((float) i), 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(0.2916667f * ((float) i), 0.75f * ((float) j)), new PointF(0.2916667f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.2916667f * ((float) i), ((float) j) * 1.0f), new PointF(0.2916667f * ((float) i), 0.75f * ((float) j)), new PointF(0.5833333f * ((float) i), 0.75f * ((float) j)), new PointF(0.5833333f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.5833333f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.5833333f * ((float) i), ((float) j) * 1.0f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.2916667f * ((float) i), ((float) j) * 0.0f), new PointF(0.2916667f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(0.2916667f * ((float) i), 0.25f * ((float) j)), new PointF(0.2916667f * ((float) i), ((float) j) * 0.0f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.0f), new PointF(0.5833333f * ((float) i), 0.25f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(0.2916667f * ((float) i), 0.25f * ((float) j)), new PointF(0.2916667f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.2916667f * ((float) i), ((float) j) * 1.0f), new PointF(0.2916667f * ((float) i), 0.25f * ((float) j)), new PointF(0.5833333f * ((float) i), 0.25f * ((float) j)), new PointF(0.5833333f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(0.5833333f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.3333333f)});
        obj.add(new PointF[]{new PointF(((float) i) * 1.0f, ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.3333333f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f)});
        obj.add(new PointF[]{new PointF(0.5833333f * ((float) i), ((float) j) * 1.0f), new PointF(0.5833333f * ((float) i), ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 0.6666667f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
    }
}
