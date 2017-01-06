package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemEverydayTwoBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_two_one_one, 1);
        sViewsWithIds.put(R.id.iv_two_one_one, 2);
        sViewsWithIds.put(R.id.tv_two_one_one_title, 3);
        sViewsWithIds.put(R.id.ll_two_one_two, 4);
        sViewsWithIds.put(R.id.iv_two_one_two, 5);
        sViewsWithIds.put(R.id.tv_two_one_two_title, 6);
    }
    // views
    public final android.widget.ImageView ivTwoOneOne;
    public final android.widget.ImageView ivTwoOneTwo;
    public final android.widget.LinearLayout llTwoOne;
    public final android.widget.LinearLayout llTwoOneOne;
    public final android.widget.LinearLayout llTwoOneTwo;
    public final android.widget.TextView tvTwoOneOneTitle;
    public final android.widget.TextView tvTwoOneTwoTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEverydayTwoBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.ivTwoOneOne = (android.widget.ImageView) bindings[2];
        this.ivTwoOneTwo = (android.widget.ImageView) bindings[5];
        this.llTwoOne = (android.widget.LinearLayout) bindings[0];
        this.llTwoOne.setTag(null);
        this.llTwoOneOne = (android.widget.LinearLayout) bindings[1];
        this.llTwoOneTwo = (android.widget.LinearLayout) bindings[4];
        this.tvTwoOneOneTitle = (android.widget.TextView) bindings[3];
        this.tvTwoOneTwoTitle = (android.widget.TextView) bindings[6];
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

    public static ItemEverydayTwoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayTwoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEverydayTwoBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_everyday_two, root, attachToRoot, bindingComponent);
    }
    public static ItemEverydayTwoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayTwoBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_everyday_two, null, false), bindingComponent);
    }
    public static ItemEverydayTwoBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemEverydayTwoBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_everyday_two_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEverydayTwoBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}