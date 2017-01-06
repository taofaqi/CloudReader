package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivitySlideShadeViewBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"header_slide_shape"},
            new int[] {2},
            new int[] {R.layout.header_slide_shape});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nsv_scrollview, 3);
        sViewsWithIds.put(R.id.rl_title_head, 4);
        sViewsWithIds.put(R.id.iv_title_head_bg, 5);
        sViewsWithIds.put(R.id.title_tool_bar, 6);
        sViewsWithIds.put(R.id.tv_title, 7);
        sViewsWithIds.put(R.id.tv_subtitle, 8);
    }
    // views
    public final com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding include;
    public final android.widget.ImageView ivTitleHeadBg;
    public final android.widget.LinearLayout llHeaderView;
    private final android.widget.FrameLayout mboundView0;
    public final com.example.jingbin.cloudreader.view.MyNestedScrollView nsvScrollview;
    public final android.widget.RelativeLayout rlTitleHead;
    public final android.support.v7.widget.Toolbar titleToolBar;
    public final android.widget.TextView tvSubtitle;
    public final android.widget.TextView tvTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySlideShadeViewBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.include = (com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) bindings[2];
        this.ivTitleHeadBg = (android.widget.ImageView) bindings[5];
        this.llHeaderView = (android.widget.LinearLayout) bindings[1];
        this.llHeaderView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nsvScrollview = (com.example.jingbin.cloudreader.view.MyNestedScrollView) bindings[3];
        this.rlTitleHead = (android.widget.RelativeLayout) bindings[4];
        this.titleToolBar = (android.support.v7.widget.Toolbar) bindings[6];
        this.tvSubtitle = (android.widget.TextView) bindings[8];
        this.tvTitle = (android.widget.TextView) bindings[7];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.subjectsBean :
                return true;
        }
        return false;
    }

    public void setSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean) {
        // not used, ignore
    }
    public com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean getSubjectsBean() {
        return null;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) object, fieldId);
            case 1 :
                return onChangeInclude((com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean subjectsBean, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeInclude(com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding include, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
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
        include.executePendingBindings();
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivitySlideShadeViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySlideShadeViewBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySlideShadeViewBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view, root, attachToRoot, bindingComponent);
    }
    public static ActivitySlideShadeViewBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySlideShadeViewBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view, null, false), bindingComponent);
    }
    public static ActivitySlideShadeViewBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySlideShadeViewBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_slide_shade_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySlideShadeViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subjectsBean
        flag 1 (0x2L): include
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}