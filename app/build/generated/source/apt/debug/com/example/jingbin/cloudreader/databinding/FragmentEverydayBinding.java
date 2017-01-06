package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class FragmentEverydayBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.xrv_everyday, 1);
        sViewsWithIds.put(R.id.ll_loading, 2);
        sViewsWithIds.put(R.id.iv_loading, 3);
    }
    // views
    public final android.widget.ImageView ivLoading;
    public final android.widget.LinearLayout llLoading;
    private final android.widget.RelativeLayout mboundView0;
    public final com.example.xrecyclerview.XRecyclerView xrvEveryday;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEverydayBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.ivLoading = (android.widget.ImageView) bindings[3];
        this.llLoading = (android.widget.LinearLayout) bindings[2];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.xrvEveryday = (com.example.xrecyclerview.XRecyclerView) bindings[1];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            case BR.gankBean :
                return true;
        }
        return false;
    }

    public void setGankBean(com.example.jingbin.cloudreader.bean.GankIoDataBean gankBean) {
        // not used, ignore
    }
    public com.example.jingbin.cloudreader.bean.GankIoDataBean getGankBean() {
        return null;
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

    public static FragmentEverydayBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentEverydayBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentEverydayBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.fragment_everyday, root, attachToRoot, bindingComponent);
    }
    public static FragmentEverydayBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentEverydayBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.fragment_everyday, null, false), bindingComponent);
    }
    public static FragmentEverydayBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentEverydayBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_everyday_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentEverydayBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): gankBean
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}