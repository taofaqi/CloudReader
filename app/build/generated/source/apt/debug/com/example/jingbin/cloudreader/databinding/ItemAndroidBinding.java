package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.view.View;
public class ItemAndroidBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_all_welfare, 4);
        sViewsWithIds.put(R.id.ll_welfare_other, 5);
        sViewsWithIds.put(R.id.iv_android_pic, 6);
        sViewsWithIds.put(R.id.tv_content_type, 7);
    }
    // views
    public final android.widget.ImageView ivAllWelfare;
    public final android.widget.ImageView ivAndroidPic;
    public final android.widget.LinearLayout llAll;
    public final android.widget.LinearLayout llWelfareOther;
    public final android.widget.TextView tvAndroidDes;
    public final android.widget.TextView tvAndroidTime;
    public final android.widget.TextView tvAndroidWho;
    public final android.widget.TextView tvContentType;
    // variables
    private com.example.jingbin.cloudreader.bean.GankIoDataBean.ResultBean mResultsBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAndroidBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.ivAllWelfare = (android.widget.ImageView) bindings[4];
        this.ivAndroidPic = (android.widget.ImageView) bindings[6];
        this.llAll = (android.widget.LinearLayout) bindings[0];
        this.llAll.setTag(null);
        this.llWelfareOther = (android.widget.LinearLayout) bindings[5];
        this.tvAndroidDes = (android.widget.TextView) bindings[1];
        this.tvAndroidDes.setTag(null);
        this.tvAndroidTime = (android.widget.TextView) bindings[3];
        this.tvAndroidTime.setTag(null);
        this.tvAndroidWho = (android.widget.TextView) bindings[2];
        this.tvAndroidWho.setTag(null);
        this.tvContentType = (android.widget.TextView) bindings[7];
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
            case BR.resultsBean :
                setResultsBean((com.example.jingbin.cloudreader.bean.GankIoDataBean.ResultBean) variable);
                return true;
        }
        return false;
    }

    public void setResultsBean(com.example.jingbin.cloudreader.bean.GankIoDataBean.ResultBean resultsBean) {
        this.mResultsBean = resultsBean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.resultsBean);
        super.requestRebind();
    }
    public com.example.jingbin.cloudreader.bean.GankIoDataBean.ResultBean getResultsBean() {
        return mResultsBean;
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
        java.lang.String publishedAtResultsBe = null;
        java.lang.String timeUtilGetTranslate = null;
        java.lang.String whoResultsBean = null;
        com.example.jingbin.cloudreader.bean.GankIoDataBean.ResultBean resultsBean = mResultsBean;
        boolean textUtilsIsEmptyText = false;
        java.lang.String TextUtilsIsEmptyText1 = null;
        java.lang.String descResultsBean = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (resultsBean != null) {
                    // read resultsBean.publishedAt
                    publishedAtResultsBe = resultsBean.getPublishedAt();
                    // read resultsBean.who
                    whoResultsBean = resultsBean.getWho();
                    // read resultsBean.desc
                    descResultsBean = resultsBean.getDesc();
                }


                // read TimeUtil.getTranslateTime(resultsBean.publishedAt)
                timeUtilGetTranslate = com.example.jingbin.cloudreader.utils.TimeUtil.getTranslateTime(publishedAtResultsBe);
                // read TextUtils.isEmpty(resultsBean.who)
                textUtilsIsEmptyText = android.text.TextUtils.isEmpty(whoResultsBean);
                if((dirtyFlags & 0x3L) != 0) {
                    if (textUtilsIsEmptyText) {
                        dirtyFlags |= 0x8L;
                    } else {
                        dirtyFlags |= 0x4L;
                    }}
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read TextUtils.isEmpty(resultsBean.who) ? @android:string/no_name : resultsBean.who
                TextUtilsIsEmptyText1 = (textUtilsIsEmptyText) ? (tvAndroidWho.getResources().getString(R.string.no_name)) : (whoResultsBean);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAndroidDes, descResultsBean);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAndroidTime, timeUtilGetTranslate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAndroidWho, TextUtilsIsEmptyText1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemAndroidBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemAndroidBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemAndroidBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_android, root, attachToRoot, bindingComponent);
    }
    public static ItemAndroidBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemAndroidBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_android, null, false), bindingComponent);
    }
    public static ItemAndroidBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemAndroidBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_android_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemAndroidBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): resultsBean
        flag 1 (0x2L): null
        flag 2 (0x3L): TextUtils.isEmpty(resultsBean.who) ? @android:string/no_name : resultsBean.who
        flag 3 (0x4L): TextUtils.isEmpty(resultsBean.who) ? @android:string/no_name : resultsBean.who
    flag mapping end*/
    //end
}