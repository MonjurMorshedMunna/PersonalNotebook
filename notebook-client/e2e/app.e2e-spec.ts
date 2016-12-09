import { NotebookClientPage } from './app.po';

describe('notebook-client App', function() {
  let page: NotebookClientPage;

  beforeEach(() => {
    page = new NotebookClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
