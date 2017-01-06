package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class FragmentOneBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.list_one, 1);
    }
    // views
    public final android.widget.FrameLayout frameLayout;
    public final com.example.xrecyclerview.XRecyclerView listOne;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOneBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.frameLayout = (android.widget.FrameLayout) bindings[0];
        this.frameLayout.setTag(null);
        this.listOne = (com.example.xrecyclerview.XRecyclerView) bindings[1];
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

    public static FragmentOneBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentOneBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentOneBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.fragment_one, root, attachToRoot, bindingComponent);
    }
    public static FragmentOneBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentOneBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.fragment_one, null, false), bindingComponent);
    }
    public static FragmentOneBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FragmentOneBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_one_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentOneBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}