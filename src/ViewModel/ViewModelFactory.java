package ViewModel;

import Model.ModelFactory;

public class  ViewModelFactory
{
  private ViewModel viewModel;

  public ViewModelFactory(ModelFactory factory)
  {
    viewModel =new ViewModel(factory.getModel());
  }

  public ViewModel getViewModel()
  {
    return viewModel;
  }
}
