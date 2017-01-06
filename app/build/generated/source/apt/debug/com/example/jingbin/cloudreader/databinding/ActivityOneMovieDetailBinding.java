package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ActivityOneMovieDetailBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.xrv_cast, 3);
    }
    // views
    public final android.widget.FrameLayout activityOneMovieDetail;
    private final android.widget.TextView mboundView2;
    public final android.widget.TextView tvOneTitle;
    public final com.example.xrecyclerview.XRecyclerView xrvCast;
    // variables
    private com.example.jingbin.cloudreader.bean.MovieDetailBean mBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOneMovieDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.activityOneMovieDetail = (android.widget.FrameLayout) bindings[0];
        this.activityOneMovieDetail.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvOneTitle = (android.widget.TextView) bindings[1];
        this.tvOneTitle.setTag(null);
        this.xrvCast = (com.example.xrecyclerview.XRecyclerView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            case BR.bean :
                setBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) variable);
                return true;
        }
        return false;
    }

    public void setBean(com.example.jingbin.cloudreader.bean.MovieDetailBean bean) {
        updateRegistration(0, bean);
        this.mBean = bean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.MovieDetailBean getBean() {
        return mBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBean(com.example.jingbin.cloudreader.bean.MovieDetailBean bean, int fieldId) {
        switch (fieldId) {
            case BR.aka: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
            case BR.summary: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
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
        java.lang.String stringFormatUtilForm = null;
        com.example.jingbin.cloudreader.bean.MovieDetailBean bean = mBean;
        java.util.List<java.lang.String> akaBean = null;
        java.lang.String summaryBean = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (bean != null) {
                        // read bean.aka
                        akaBean = bean.getAka();
                    }


                    // read StringFormatUtil.formatGenres(bean.aka)
                    stringFormatUtilForm = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(akaBean);
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (bean != null) {
                        // read bean.summary
                        summaryBean = bean.getSummary();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, summaryBean);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneTitle, stringFormatUtilForm);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityOneMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityOneMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityOneMovieDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail, root, attachToRoot, bindingComponent);
    }
    public static ActivityOneMovieDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityOneMovieDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail, null, false), bindingComponent);
    }
    public static ActivityOneMovieDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityOneMovieDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_one_movie_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityOneMovieDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bean
        flag 1 (0x2L): bean.aka
        flag 2 (0x3L): bean.summary
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}