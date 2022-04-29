import ManifestCreation from './views/ManifestCreation';
import DataExtraction from './views/DataExtraction';

const routes = [
  {
    path: '/',
    element: <DataExtraction />,
    exact: true,
  },
  {
    path: '/manifest-creation',
    element: <ManifestCreation />,
    exact: true,
  },
];

export default routes;
