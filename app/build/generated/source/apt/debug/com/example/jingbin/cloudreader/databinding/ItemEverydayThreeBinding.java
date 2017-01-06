package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemEverydayThreeBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_three_one_one, 1);
        sViewsWithIds.put(R.id.iv_three_one_one, 2);
        sViewsWithIds.put(R.id.tv_three_one_one_title, 3);
        sViewsWithIds.put(R.id.ll_three_one_two, 4);
        sViewsWithIds.put(R.id.iv_three_one_two, 5);
        sViewsWithIds.put(R.id.tv_three_one_two_title, 6);
        sViewsWithIds.put(R.id.ll_three_one_three, 7);
        sViewsWithIds.put(R.id.iv_three_one_three, 8);
        sViewsWithIds.put(R.id.tv_three_one_three_title, 9);
    }
    // views
    public final android.widget.ImageView ivThreeOneOne;
    public final android.widget.ImageView ivThreeOneThree;
    public final android.widget.ImageView ivThreeOneTwo;
    public final android.widget.LinearLayout llThreeOne;
    public final android.widget.LinearLayout llThreeOneOne;
    public final android.widget.LinearLayout llThreeOneThree;
    public final android.widget.LinearLayout llThreeOneTwo;
    public final android.widget.TextView tvThreeOneOneTitle;
    public final android.widget.TextView tvThreeOneThreeTitle;
    public final android.widget.TextView tvThreeOneTwoTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEverydayThreeBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.ivThreeOneOne = (android.widget.ImageView) bindings[2];
        this.ivThreeOneThree = (android.widget.ImageView) bindings[8];
        this.ivThreeOneTwo = (android.widget.ImageView) bindings[5];
        this.llThreeOne = (android.widget.LinearLayout) bindings[0];
        this.llThreeOne.setTag(null);
        this.llThreeOneOne = (android.widget.LinearLayout) bindings[1];
        this.llThreeOneThree = (android.widget.LinearLayout) bindings[7];
        this.llThreeOneTwo = (android.widget.LinearLayout) bindings[4];
        this.tvThreeOneOneTitle = (android.widget.TextView) bindings[3];
        this.tvThreeOneThreeTitle = (android.widget.TextView) bindings[9];
        this.tvThreeOneTwoTitle = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemEverydayThreeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayThreeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEverydayThreeBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_everyday_three, root, attachToRoot, bindingComponent);
    }
    public static ItemEverydayThreeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayThreeBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_everyday_three, null, false), bindingComponent);
    }
    public static ItemEverydayThreeBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayThreeBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_everyday_three_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEverydayThreeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}