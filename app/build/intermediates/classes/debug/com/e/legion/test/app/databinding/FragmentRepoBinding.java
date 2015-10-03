package com.e.legion.test.app.databinding;
import com.e.legion.test.app.R;
import com.e.legion.test.app.BR;
import android.view.View;
public class FragmentRepoBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_commits, 1);
        sViewsWithIds.put(R.id.pb_commits, 2);
    }
    // views
    private final android.widget.FrameLayout mboundView0;
    public final android.widget.ProgressBar pbCommits;
    public final android.support.v7.widget.RecyclerView rvCommits;
    // variables
    // values
    // listeners
    
    public FragmentRepoBinding(View root) {
        super(root, 0);
        final Object[] bindings = mapBindings(root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbCommits = (android.widget.ProgressBar) bindings[2];
        this.rvCommits = (android.support.v7.widget.RecyclerView) bindings[1];
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
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
    
    private void log(String msg, long i) {
        android.util.Log.d("BINDER", msg + ":" + Long.toHexString(i));
    }
    
    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }
    
    public void setRepo(com.e.legion.test.app.entities.Repo repo) {
        // not used, ignore
    }
    public com.e.legion.test.app.entities.Repo getRepo() {
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
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static FragmentRepoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return android.databinding.DataBindingUtil.<FragmentRepoBinding>inflate(inflater, com.e.legion.test.app.R.layout.fragment_repo, root, attachToRoot);
    }
    public static FragmentRepoBinding inflate(android.view.LayoutInflater inflater) {
        return bind(inflater.inflate(com.e.legion.test.app.R.layout.fragment_repo, null, false));
    }
    public static FragmentRepoBinding bind(android.view.View view) {
        if (!"layout/fragment_repo_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentRepoBinding(view);
    }
}
    /* flag mapping
        flag 0: repo~
        flag 1: INVALIDATE ANY
    flag mapping end*/
    //end