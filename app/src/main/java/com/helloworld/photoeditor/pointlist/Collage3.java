package com.helloworld.photoeditor.pointlist;

import android.graphics.PointF;

import com.helloworld.photoeditor.R;

import java.util.ArrayList;

public class Collage3 extends Collage {
    public static int shapeCount = 3;

    public Collage3(int i, int j) {
        this.collageLayoutList = new ArrayList();
        PointF[] apointf = new PointF[4];
        ArrayList obj = new ArrayList();
        obj.add(new PointF[]{new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.2f * ((float) j)), new PointF(0.2f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.2f * ((float) j))});
        CollageLayout obj2 = new CollageLayout(obj);
        obj2.maskPairList.add(new MaskPair(2, R.drawable.mask_circle));
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(0.58f * ((float) i), ((float) j) * 0.5f), new PointF(0.58f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.58f * ((float) i), ((float) j) * 1.0f), new PointF(0.58f * ((float) i), ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(0.42f * ((float) i), 0.25f * ((float) j)), new PointF(0.42f * ((float) i), 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.maskPairList.add(new MaskPair(0, R.drawable.mask_hexagon));
        obj2.maskPairList.add(new MaskPair(1, R.drawable.mask_hexagon));
        obj2.maskPairList.add(new MaskPair(2, R.drawable.mask_hexagon));
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.25f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 0.5f, 0.75f * ((float) j)), new PointF(0.75f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 0.5f, 0.25f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.2f * ((float) j)), new PointF(0.2f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.2f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.maskPairList.add(new MaskPair(2, R.drawable.mask_heart));
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.2f * ((float) j)), new PointF(0.2f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.2f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.maskPairList.add(new MaskPair(2, R.drawable.mask_hexagon));
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.2f * ((float) j)), new PointF(0.2f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.8f * ((float) j)), new PointF(0.8f * ((float) i), 0.2f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.maskPairList.add(new MaskPair(2, R.drawable.mask_circle));
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, 0.6666667f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.25f * ((float) j)), new PointF(0.2f * ((float) i), 0.75f * ((float) j)), new PointF(0.8f * ((float) i), 0.75f * ((float) j)), new PointF(0.8f * ((float) i), 0.25f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.5f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.2f * ((float) i), 0.25f * ((float) j)), new PointF(0.2f * ((float) i), 0.75f * ((float) j)), new PointF(0.8f * ((float) i), 0.75f * ((float) j)), new PointF(0.8f * ((float) i), 0.25f * ((float) j))});
        obj2 = new CollageLayout(obj);
        obj2.setClearIndex(2);
        this.collageLayoutList.add(obj2);
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.3333333f * ((float) i), ((float) j) * 0.0f), new PointF(0.3333333f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.3333333f * ((float) i), ((float) j) * 0.5f), new PointF(0.3333333f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.6666667f * ((float) i), ((float) j) * 0.0f), new PointF(0.6666667f * ((float) i), ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(0.6666667f * ((float) i), ((float) j) * 0.5f), new PointF(0.6666667f * ((float) i), ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, 0.6666667f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 1.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 0.5f, 0.3333333f * ((float) j)), new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 0.5f, 0.3333333f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.5f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.5f), new PointF(((float) i) * 0.5f, ((float) j) * 0.5f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f)});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 0.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.25f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 0.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, 0.75f * ((float) j)), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f)});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, 0.6666667f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.6666667f * ((float) j)), new PointF(((float) i) * 0.5f, 0.6666667f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
        obj = new ArrayList();
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, ((float) j) * 1.0f), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 0.0f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 0.5f, 0.3333333f * ((float) j))});
        obj.add(new PointF[]{new PointF(((float) i) * 0.5f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, ((float) j) * 0.0f), new PointF(((float) i) * 1.0f, 0.3333333f * ((float) j)), new PointF(((float) i) * 0.5f, 0.3333333f * ((float) j))});
        this.collageLayoutList.add(new CollageLayout(obj));
    }
}
